package Banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double firstTransaction){
        Branch branch = findBranch(branchName);
        if(branch == null)
            return false;
        return branch.newCustomer(customerName,firstTransaction);
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction ){
        Branch branch = findBranch(branchName);
        if(branch == null)
            return false;
        return branch.addCustomerTransaction(customerName,transaction);
    }

    private Branch findBranch(String branchName){
        for(Branch branch : branches){
            if(branch.getName().equals(branchName))
                return branch;
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch == null){
            return false;
        }
        System.out.println("Customer details for branch " + branchName);
        int i = 1;
        for(Customer customer : branch.getCustomers()){
            System.out.println("Customer: " + customer.getName() + "[" + i + "]");

            if(printTransactions){
                System.out.println("Transactions");
                ArrayList<Double> transactions = customer.getTransactions();
                for (int j = 0; j < transactions.size() ; j++) {
                    System.out.println("[" + j+1 + "]  Amount " + transactions.get(j));
                }
            }
            i++;
        }
        return true;
    }
}

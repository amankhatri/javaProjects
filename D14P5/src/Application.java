/*suppose A has to write a class which implements debits for a bank so 
 * he creates a class called class AccoundDebit extends Thread {
 * in which he has debit method 
 * debit( accountNumber , amount , or anything) {
 *				He will get the amount from the account
 *				Update the account with latest amount
 * }
 * 
 * }
 * 
 * Now this logic is called by several thousand people at same time at atms and net banking , 
 * so this logic will be definitely multithreaded. if my application should be able to create
 * multiple threads dynamically for multiple users. when we do extends Thread, many threads can be 
 * created of the application 
 * NOw let us say B wants to withdraw 2000 where his accound has 2000 bucks, he inserts his cards
 * in atm and all the things happen behind the seen by debit method, and B gets the money, now
 * the amount has been updated with 0 bucks. This scenario works fine
 * 
 * Now if B is trying to withdraw 2000 bucks using ATM and net banking , we know that account number
 * is same for both the withdrwal, however this time there would be two threads for same account 
 * number and debit method will be executed simultanously so both the threads will check the balance
 * and will see 2000 bucks since both threads are parallel. so now we can withdraw 2000 bucks from
 * both the request. so what i will do is, I will lock the debit method , so B who wants
 * to execute debit method will lock the method for that one thread at a time and release debit method before 
 * getting out so , no two request will be executed simultaneously.  */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

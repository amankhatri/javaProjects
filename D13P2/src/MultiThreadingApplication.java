
/*Seperate processes do not have access to each others memory space. Many OSes have shared memory 
 * system so that processes can shage memory space
 * Each process has it own address memory space
 * the OS scheduler decides when each process is executed
 * 	Ony one process is acrually executing at any given time. However, the system appears to be running
 * 	several programs simultaneously
 * we can have main thread and then we can have child threads. Public static void main is the main 
 * thread. Each thread has its own dedicated memory. 
 * 	if c = a+b, and d = c+f, since these task are dependent, this can be a useless application of 
 * threading, however, any kind of application which has distinct task which can be performed 
 * independently -- 
 * 		1)Any application with a GUI
 * 			Threads dedicated to the GUI can delegate the processing of user request to other threads
 * 			The GUI remains responsive to the user even when the user's requests are being processed
 * 		2) Any application which requires asynchronous response
 * 			I will ask a question to A, and if he responds instantly that is synchronous communication
 * 			where as in asynchronous application i do not get instant response, but he does acknowledge
 * 			That I will respond in 2 days, so after 2 days I get a response and I move further with 
 * 			the code. In the synchronous application , the client (caller) will wait for response 
 * 			where as in asynchronous application I will wait for response, I would perform different
 * 			task while I get the response. In this case once I have asked the question to A , i will
 * 			forget about it, until the other guy reminds me that response is ready.
 * 			Network based application are ideally suited to multithreading
 * 				Data can arrive from the network*/

/*Working of thread
 * 	1) Each thread is given its own context, that is memory and objects
 * 		A thread context includes virtual registers and its own calling stack
 * 	2) The scheduler decides which thread executes at any given time
 * 		The VM may use its own scheduler
 * 		Since many os now directly support multithreading, the VM may use the system's scheduler for 
 * 		Scheduling threads.
 * 	3) The scheduler maintains a list of ready threads(thre run queue) and a list of threads waiting for 
 * 		inputs
 *  4) Each thread has a priority. The scheduler typically schedules between the highest priority threads 
 *  	in the run queue.
 *  	NOTE: THE PROGRAMMER CAN NOT MAKE ASSUMPTIONS ABOUT HOW THREADS ARE GOING TO BE SCHEDULED. 
 *  	tYPICALLY THREADS WILL BE EXECUTED DIFFERENTLY ON DIFFERENT PLATFORMS.
 *   if we have c = ab and d = cb , we can tell the processor which one has priority but it is not
 *   mandatory that processor will execute it in the right order.
 *   
 *   we can also do multithreading using c, but it is difficult, in jvada threads are represented by 
 *   a Thread class
 *   	A thread object maintains the state of the thread
 *   	It provides control methods such as interrupts, sleep etc
 *   
 *   Life cycle of threads 
 *   		1) Thread gets created, when we inherit the thread class 
 *   		2) Then we start the thread using Runnable , if thread is waiting for something, 
 *   		or has some dependencies, cpu will put it in a rest state known as waiting state or
 *   		blocked state, it will wait and the response is read the thread will come to 
 *   		runnable state, thread may go to runnable to blocked and back and forth again and again
 *   		3) at the end thread dies. 
 *    A give work to B, B takes some time so A can sleep for some specified time 
 *    if A doesn't know how long it takes for B then A tells B that just notify me  when you are done
 *    , B tells A to wait and once be is done B notifies A at the end of the jobs
 *     
 *    B */
public class MultiThreadingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

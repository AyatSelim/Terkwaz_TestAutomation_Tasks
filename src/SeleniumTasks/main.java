package SeleniumTasks;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		  Task1_Run  TASK_RUN = new Task1_Run ();
	      Task2_Upload_File_Run TC_Run  = new Task2_Upload_File_Run () ;
	  
	      TASK_RUN.Task1_Run();
	      TC_Run.Run_Test_Case();	
	 
	   	  Task3_1_DynamicLoad_Run TASK3_RUN = new Task3_1_DynamicLoad_Run();
		  TASK3_RUN.Task3_run();
	}

}

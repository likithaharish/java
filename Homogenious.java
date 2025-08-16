import java.util.Scanner;


public class Homogenious {

	
		
		static int queue[] = new int[5];
		static int rear = -1, front = -1;
		static Scanner s = new Scanner(System.in);

		public static void main(String[] args) {
			int choice = 0;
			do {
				System.out.println("Enter ur choice");
				System.out.println("Press 1: Insert");
				System.out.println("Press 2: Delete");
				System.out.println("Press 3: Display");
				System.out.println("Press 4: Exit");
				choice = s.nextInt();

				switch (choice) {

				case 1:
					System.out.println("*******************************");
					insert();
					System.out.println("********************************");
					break;

				case 2:
					System.out.println("*********************************");
					delete();
					System.out.println("********************************");
					break;
				case 3:
					System.out.println("**********************************");
					display();
					System.out.println("*********************************");

				}

			} while (choice < 4);

		}

		static void delete() {
			// TODO Auto-generated method stub
			
		}

		static void display() {
			
			
			if(front==-1)
			{
				System.out.println("queue underflow");
			}else
			{
				int het=0,homo=0;
				if(rear==0){
					System.out.println("nither");
				}
				for(int i=0;i<rear;i++)
				{
					if(rear==0){
						System.out.println("nither");
					}else{
						int j=i;
						if(queue[i]==queue[++j]){
							homo++;
						}else{
							System.out.println("hi");
							het++;
							
						}
					}
					
				}
				
				if(homo>0||het>0){
					
					if(homo>0&&het>0){
					
						System.out.println("the queue contain both homo and hetrogenius element");
					}else{
						if(homo>0){
							System.out.println("the queue contain only homogenius");
						}else{
							System.out.println("the queue contain only hetrogenious");
						}
					}
				}
				
				
				
			}
		}

		static void insert() {
			
			
			if(rear==queue.length-1) {
				System.out.println("queue overflow");
			}
			else {
				System.out.println("enter the element to insert");
				if(rear==-1 && front==-1)
				{
					front++;
					rear++;
				}
				else
				{
					rear++;
				}
				queue[rear]=s.nextInt();
			}
		}

		
	}



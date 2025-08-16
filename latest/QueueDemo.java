import java.util.Scanner;

public class QueueDemo {

	static int queue[] = new int[3];
	static int front = -1, rear = -1;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int choice = 0;

		do {
			System.out.println("enter ur choice");
			System.out.println("1:Insert");
			System.out.println("2.Delete");
			System.out.println("3.Display");
			System.out.println("4.Exit");
			choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("*****************************");
				insert();
				System.out.println("******************************");
				break;

			case 2:
				System.out.println("********************************");
				delete();
				System.out.println("********************************");
				break;

			case 3:
				System.out.println("********************************");
				display();
				System.out.println("**********************************");
				break;

			}

		} while (choice < 4);
	}

	private static void delete() {
		if (front == queue.length && rear == queue.length - 1) {
			rear = -1;
			front = -1;
			System.out.println("Queue Restarted");
			return;
		}
		if (front == -1 || front == rear + 1) {
			System.out.println("queue underflow");

			return;
		}
		System.out.println(queue[front++] + " element is deleted");

	}

	private static void display() {
		if (front == -1 && rear == -1) {
			System.out.println("no elements are present");
			return;
		}
		if (front > rear) {
			System.out.println("no elements are present");
			return;
		}
		System.out.println("the elements are");
		for (int i = front; i <= rear; i++) {
			System.out.print(queue[i] + ",");

		}
		System.out.println(" ");

	}

	private static void insert() {

		if (front == queue.length && rear == queue.length - 1) {
			rear = -1;
			front = -1;
			System.out.println("Queue Restarted");
			return;
		}

		if (rear == queue.length - 1) {
			System.out.println("queue overflow");
			return;

		}
		if (rear == -1 && front == -1) {
			rear++;
			front++;
		} else {
			rear++;
		}
		System.out.println("enter the element to insert");
		int ele = s.nextInt();
		queue[rear] = ele;

	}

}

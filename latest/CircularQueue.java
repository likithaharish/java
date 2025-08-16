import java.util.Scanner;

public class CircularQueue {

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

	static void display() {

		if (rear == -1 && front == -1) {
			System.out.println("no elements are present");
		} else {
			System.out.println("the elements are");
			if (front <= rear) {
				for (int i = front; i <= rear; i++) {
					System.out.print(queue[i] + " ");
				}

			} else {
				for (int i = front; i < queue.length; i++) {
					System.out.print(queue[i] + " ");
				}
				for (int j = 0; j <= rear; j++) {
					System.out.print(queue[j] + " ");
				}

			}

		}
		System.out.println(" ");

	}

	static void delete() {

		if (rear == -1 && front == -1) {
			System.out.println("statck underflow");
			return;
		} else {
			System.out.println("the deleted elemnt is=" + queue[front]);
			if (rear == front) {
				rear = -1;
				front = -1;

			} else {
				if (front == queue.length - 1) {
					front = 0;
				} else {
					front++;
				}

			}

		}

	}

	static void insert() {
		if ((front == 0 && rear == queue.length - 1) || (front == rear + 1)) {
			System.out.println("queue overflow");
			return;
		} else {
			if (rear == -1 && front == -1) {
				rear++;
				front++;
			} else {
				if (rear == queue.length - 1) {
					rear = 0;
				} else {
					rear++;
				}

			}

		}
		System.out.println("enter the element to insert");
		int ele = s.nextInt();
		queue[rear] = ele;
		System.out.println("element inserted sucessfully");

	}

}

class Third implements Runnable{


@Override
public void run() {
System.out.println("indside run method "+Thread.currentThread());

}

}


public class MainAppRunnable {


public static void main(String[] args) {
Third obj = new Third();
Thread tobj = new Thread(obj);
System.out.println("Main thred ="+Thread.currentThread());
//tobj.run();
tobj.setName("firstThread");
tobj.start();
}


}

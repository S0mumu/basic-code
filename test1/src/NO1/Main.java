package NO1;

/**
 * @author ：rb
 * @version:
 */
public class Main {

//    public String reverse(String origin,int k){
//        int length=origin.length();
//
////        String s1=origin.substring(0,length-k);
////        String s2=origin.substring(length-k);
////        String res=s2+s1;
////        return res;
//        for (int i = 0; i <origin.length() ; i++) {
//            int cur=(i+k)%length;
//
//        }
//
//    }

    public int[] getMax(int[] list,int k){
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            int max=Integer.MIN_VALUE;
            int index=0;
            for (int j = 0; j <list.length ; j++) {
                if(list[j]>max){
                    max=list[j];
                    index=j;
                }
            }
            res[i]=max;
            list[index]=Integer.MIN_VALUE;
        }
        return res;
    }
    public static void main(String[] args) {
//        Main main=new Main();
//        System.out.println(main.reverse("hello world in java",3));
//        Main main=new Main();
//        int[] res=main.getMax(new int[]{1,4,5,2,1},1);
//        for (int i = 0; i <res.length ; i++) {
//            System.out.println(res[i]);
//        }
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //Thread.yield();
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("我是t2");
            }
        });
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("我是t1");
            }
        });
        t1.start();
//        synchronized (t1) {
//            t1.start();
//            try {
//                t1.wait(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        t2.start();

    }
}

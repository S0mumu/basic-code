package cn.rb.July.No22;
import java.util.*;

/*
 识别有效的IP地址和掩码并进行分类统计
 */
public class Main{
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        int A=0;
        int B=0;
        int C=0;
        int D=0;
        int E=0;
        int wrongIpOrMask=0;
        int privateIp=0;
        while(sc.hasNext()){
            String s=sc.nextLine();
            if(s.split("~").length!=2){
                wrongIpOrMask++;
                continue;
            }
            String[] ip = s.split("~")[0].split("\\.");
            String[] mask = s.split("~")[1].split("\\.");

            if ( ip.length != 4 || mask.length != 4 ){ // ip,掩码的字节数量是否为4
                wrongIpOrMask++;
                continue ;
            }

            //开始检查ip mask 是否0-255
            int flag=0;
            for (int i = 0; i <ip.length ; i++) {
                if(ip[i].length()==0 || mask[i].length()==0){
                    wrongIpOrMask++;
                    flag=1;
                    break;
                }
                int num_ip=Integer.parseInt(ip[i]);
                int num_mask=Integer.parseInt(mask[i]);
                if(num_ip<0 ||num_ip>255 || num_mask<0 || num_mask>255){
                    wrongIpOrMask++;
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                continue;
            }


            //判断mask是否出错
            Integer total=0;
            for (int i = 0; i <mask.length ; i++) {
                Integer num=Integer.parseInt(mask[i]);
                total=(total<<8)+num;
            }
            String s1 = Integer.toBinaryString(total);
            int count_1=0;
            for (int i = 0; i <s1.length() ; i++) {
                if(s1.charAt(i)=='1'){
                    count_1++;
                }
            }
            if(count_1==32){
                wrongIpOrMask++;
                continue;
            }
             System.out.println( Integer.toBinaryString(total));
            total=(~total)+1;
             System.out.println( Integer.toBinaryString(total));
            int count=0;
            while(total !=0){
                if((total & 1)==1){
                    count++;
                }
                total=total>>>1;
            }
            if(count!=1){
                //mask 出错了
                wrongIpOrMask++;
                continue;
            }

            //确定ip类型
            if(Integer.parseInt(ip[0])>=1 && Integer.parseInt(ip[0])<=126){
                A++;
                if(Integer.parseInt(ip[0])==10){
                    privateIp++;
                }
            }else if(Integer.parseInt(ip[0])>=128 &&Integer.parseInt(ip[0])<=191 ){
                B++;
                if(Integer.parseInt(ip[0])==127 && Integer.parseInt(ip[1])>=26 &&
                        Integer.parseInt(ip[1])<=31){
                    privateIp++;
                }
            }else if(Integer.parseInt(ip[0])>=192 && Integer.parseInt(ip[0])<=223){
                C++;
                if(Integer.parseInt(ip[0])==192 && Integer.parseInt(ip[1])==168){
                    privateIp++;
                }
            }else if(Integer.parseInt(ip[0])>=224 && Integer.parseInt(ip[0])<=239 ){
                D++;
            }else if(Integer.parseInt(ip[0])>=240 && Integer.parseInt(ip[0])<=255 ){
                E++;
            }

        }
        System.out.println(A+" "+B+" "+C+" "+D+" "+E+" "+wrongIpOrMask+" "+privateIp);
    }
}
package cn.rb.March.AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author ：rb
 * @version:
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces={UserDao.class};
        UserDaoImpl userDaoImpl=new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDaoImpl));
        int result=dao.add(1,2);
        System.out.println("result:"+result);
    }
}
//创建代理对象的代码
class UserDaoProxy implements InvocationHandler{

    // 1.把UserDaoImpl传递过来，用有参构造函数
    Object obj;
    public UserDaoProxy(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前执行..."+method.getName()+":传递参数...."+ Arrays.toString(args));

        //被增强的方法执行
        Object res=method.invoke(obj,args);

        //方法之后
        System.out.println("方法之后执行..."+obj);
        return res;
    }
}

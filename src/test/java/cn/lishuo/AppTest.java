package cn.lishuo;

import static org.junit.Assert.assertTrue;

import cn.lishuo.asp.UserServicesImpl;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.python.util.PythonInterpreter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Unit test for simple App.
 */



public class AppTest 
{


    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testB(){

        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserServices us=(UserServices) ac.getBean("userServices");
        /*UserServicesImpl us=MyBeanFactory.usi();*/
        us.addUser();
        us.updateUser();
        us.delUser();

    }

    @Test
    public void testC(){
        PythonInterpreter pip=new PythonInterpreter();
        pip.exec("print('Hello World')");

    }

}

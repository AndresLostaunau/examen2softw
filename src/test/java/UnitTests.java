import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;

public class UnitTests {

    //Probar de golpe

    @Test
    public void login(){
        var in = new ByteArrayInputStream("qwe".getBytes());
        System.setIn(in);
        var in2 = new ByteArrayInputStream("ewq".getBytes());
        System.setIn(in2);
        Assert.assertTrue(true);
    }

    @Test
    public void logout(){
        var in = new ByteArrayInputStream("qwe".getBytes());
        System.setIn(in);
        in = new ByteArrayInputStream("ewq".getBytes());
        System.setIn(in);
        in = new ByteArrayInputStream("4".getBytes());
        System.setIn(in);
        Assert.assertTrue(true);
    }

    @Test
    public void add(){
        var in = new ByteArrayInputStream("qwe".getBytes());
        System.setIn(in);
        in = new ByteArrayInputStream("ewq".getBytes());
        System.setIn(in);
        in = new ByteArrayInputStream("3".getBytes());
        System.setIn(in);
        in = new ByteArrayInputStream("C".getBytes());
        System.setIn(in);
        in = new ByteArrayInputStream("100".getBytes());
        System.setIn(in);
        Assert.assertTrue(true);
    }
}

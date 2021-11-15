import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void setUp(){
        bear = new Bear("Baloo", 25, 95.62);
    }

    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals( 25, bear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(95.62, bear.getWeight(), 0.01);
    }

    @Test
    public void readyToHibernateOver80(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateOver80(){
        Bear thinBear = new Bear("Bubu", 9, 25.02);
        assertEquals(false, thinBear.readyToHibernate());

        Bear bear1 = new Bear(" yogi", 65, 140 );
        Bear bear2 = bear1;

        bear2.setName("barney");

        int age1 = 33;
        int age2 = age1;
        age1 = 50;

        String str1 = "first";
        String str2 = str1;
        str2 = "second";

        System.out.println(bear1);
        System.out.println(bear2);
        System.out.println(bear1.getName());
        System.out.println(bear2.getName());

        System.out.println(age1);
        System.out.println(age2);

        System.out.println(str1);
        System.out.println(str2);

    }


}

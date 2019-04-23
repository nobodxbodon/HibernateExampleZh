package com.codeinchinese;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.junit.Test;

import com.codeinchinese.customer.model.Customer;

/**
 * Unit test for simple App.
 */
public class AppTest {

  @Test
  public void 反射() {
    Customer 客户 = new Customer("小明", new Date());
    try {
      assertEquals("小明", Customer.class.getMethod("get姓名").invoke(客户));
    } catch (IllegalAccessException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IllegalArgumentException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (NoSuchMethodException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SecurityException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

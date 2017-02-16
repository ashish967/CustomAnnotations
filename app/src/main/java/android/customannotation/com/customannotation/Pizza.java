package android.customannotation.com.customannotation;

import com.customannotation.pckg.Factory;

/**
 * Created by Ashish Kumar Khatri on 15/2/17.
 */

@Factory(type = Meal.class,
        id="pizza")
public class Pizza implements Meal {


    public int getPrice() {
        return 10;
    }
}

package com.xks.espressodemo;

import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Xingfeng on 2017-09-07.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ChangeTextTest {

    private String result;

    @Before
    public void initString(){
        result="Clicked";
    }


    @Rule
    public ActivityTestRule<MainActivity> mActivityRule=new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void changeTextTest(){

        //Step 1:定位View
        ViewInteraction view = onView(withId(R.id.btn));
        //Step 2:执行操作
        view.perform(click());
        //Step 3:判断结果
        view.check(matches(withText(result)));

    }



}

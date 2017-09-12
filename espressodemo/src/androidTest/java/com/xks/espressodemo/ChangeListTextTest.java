package com.xks.espressodemo;

import android.support.test.espresso.DataInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.instanceOf;

/**
 * Created by Xingfeng on 2017-09-07.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ChangeListTextTest {

    @Rule
    public ActivityTestRule<SecondActivity> mActivityRule=new ActivityTestRule<SecondActivity>(SecondActivity.class);

    @Test
    public void changeTextTest(){

        //Step 1:定位View
        DataInteraction dataInteraction=onData(allOf(instanceOf(String.class),hasToString(equalTo("b"))));
        //Step 2:执行操作
        dataInteraction.perform(click());
        //Step 3:判断结果，文字应该从b->B
        dataInteraction.check(matches(withText("B")));


    }



}

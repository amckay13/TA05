package com.example.user.storybookapp;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class StoryPageActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page);

        //gifView = (GIFView) findViewById(R.id.section_gif);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_story_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_story_page, container, false);
            //TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            //textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            TextView textView1 = (TextView) rootView.findViewById(R.id.section_text1);
            TextView textView2 = (TextView) rootView.findViewById(R.id.section_text2);
            TextView textNum = (TextView)rootView.findViewById(R.id.section_number);
            Resources res = getResources();

            ImageView ivGif = (ImageView) rootView.findViewById(R.id.section_image);

           /* GIFView gifView= (GIFView)rootView.findViewById(R.id.section_gif);
            String imageFile = res.getStringArray(R.array.page_image_files)[getArguments().getInt(ARG_SECTION_NUMBER)];
            int pic = res.getIdentifier(imageFile, "raw", getContext().getPackageName());
            gifView.setGIF(pic);*/
            //imageView.setImageResource(pic);
            GifAnimationDrawable gif;
            int pic_id = 0;
           /* switch(getArguments().getInt(ARG_SECTION_NUMBER)){
                case 1:
                    pic_id = R.raw.bunny1;
                    break;
                case 2:
                    pic_id = R.raw.bunny2;
                    break;
                case 3:
                    pic_id = R.raw.bunny3;
                    break;
                case 4:
                    pic_id = R.raw.bunny4;
                    break;
                case 5:
                    pic_id = R.raw.bunny5;
                    break;
                case 6:
                    pic_id = R.raw.bunny6;
                    break;
                case 7:
                    pic_id = R.raw.bunny7;
                    break;
                case 8:
                    pic_id = R.raw.bunny8;
                    break;
                case 9:
                    pic_id = R.raw.bunny9;
                    break;
            }
            */
            switch(getArguments().getInt(ARG_SECTION_NUMBER)){
            case 1:
            pic_id = R.drawable.lion1;
            break;
            case 2:
            pic_id = R.drawable.cow2;
            break;
            case 3:
            pic_id = R.drawable.sheep3;
            break;
            case 4:
            pic_id = R.drawable.duck4;
            break;
            case 5:
            pic_id = R.drawable.goat5;
            break;
            case 6:
            pic_id = R.drawable.frog6;
            break;
            case 7:
            pic_id = R.drawable.pig7;
            break;
            case 8:
            pic_id = R.drawable.dog8;
            break;
            case 9:
            pic_id = R.drawable.cat9;
            break;
        }

            /*try {
                //String imageFile = res.getStringArray(R.array.page_image_files)[getArguments().getInt(ARG_SECTION_NUMBER)];
                //int pic = res.getIdentifier(imageFile, "raw", getContext().getPackageName());
                gif = new
                        GifAnimationDrawable(getResources().openRawResource(pic_id));
                gif.setOneShot(false);
                ivGif.setImageDrawable(gif);
                gif.setVisible(true, true);
            } catch (Resources.NotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }*/
            ivGif.setImageDrawable(getResources().getDrawable(pic_id));

            textView1.setText(res.getStringArray(R.array.page_text_english)[getArguments().getInt(ARG_SECTION_NUMBER)]);
            textView2.setText(res.getStringArray(R.array.page_text_russian)[getArguments().getInt(ARG_SECTION_NUMBER)]);
            textNum.setText(""+getArguments().getInt(ARG_SECTION_NUMBER));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 9;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Page 1";
                case 1:
                    return "Page 2";
                case 2:
                    return "Page 3";
                case 3:
                    return "Page 4";
                case 4:
                    return "Page 5";
                case 5:
                    return "Page 6";
                case 6:
                    return "Page 7";
                case 7:
                    return "Page 8";
                case 8:
                    return "Page 9";
                case 9:
                    return "Page 10";
            }
            return null;
        }
    }
}

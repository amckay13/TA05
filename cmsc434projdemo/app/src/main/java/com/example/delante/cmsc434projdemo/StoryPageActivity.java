package com.example.delante.cmsc434projdemo;

import android.content.res.Resources;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Locale;

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
    static Locale loc1;
    static Locale loc2;

    static final Locale spa = new Locale("spa", "MEX");
    static final Locale rus = new Locale("rus", "RUS");
    static final Locale fra = Locale.FRENCH;
    static final Locale eng = Locale.US;

    static TextToSpeech t1;
    static TextToSpeech t2;

    static String text1;
    static String text2;
    
    public static void setLoc2(String s) {
        if (s.equals("r"))
            loc2 = rus;
        if(s.equals("s"))
            loc2 = spa;
    }



    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_page);

        //gifView = (GIFView) findViewById(R.id.section_gif);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());


        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override

            public void onPageSelected(int position) {
                setText(getResources(),position+1);
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(loc1);
                }
            }
        });

        t2 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(loc2);
                }
            }
        });

        loc1 = eng;
       //if the settings weren't manually changed, story1 default is russian
        if (loc2 == null) {
            loc2 = rus;
        }


        setText(getResources(),1);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                //         .setAction("Action", null).show();
                speakOut(view.getRootView());
            }
        });
    }

    private static void setText(Resources res, int position){
        if (loc1.getLanguage().equals(rus.getLanguage())) {
            text1 = res.getStringArray(R.array.animals_russian)[position];
        } else if (loc1.getLanguage().equals(spa.getLanguage())) {
            text1 = res.getStringArray(R.array.animals_spanish)[position];
        } else {
            text1 = res.getStringArray(R.array.animals_english)[position];
        }

        if (loc2.getLanguage().equals(rus.getLanguage())) {
            text2 = res.getStringArray(R.array.animals_russian)[position];
        } else if (loc2.getLanguage().equals(spa.getLanguage())) {
            text2 = res.getStringArray(R.array.animals_spanish)[position];
        } else {
            text2 = res.getStringArray(R.array.animals_english)[position];
        }
    }

    private static void speakOut(View rootView) {

        // Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //         .setAction("Action", null).show();

       // String text1 = ((TextView) rootView.findViewById(R.id.section_text1)).getText().toString();
       // String text2 = ((TextView) rootView.findViewById(R.id.section_text2)).getText().toString();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            String utteranceId = t1.hashCode() + "";
            t2.speak(text1, TextToSpeech.QUEUE_FLUSH, null, utteranceId);
            String utteranceId2 = t2.hashCode() + "";
            t1.speak(text2, TextToSpeech.QUEUE_FLUSH, null, utteranceId2);
        } else {
            HashMap<String, String> map = new HashMap<>();
            map.put(TextToSpeech.Engine.KEY_PARAM_UTTERANCE_ID, "MessageId");
            t2.speak(text1, TextToSpeech.QUEUE_FLUSH, map);
            t1.speak(text2, TextToSpeech.QUEUE_FLUSH, map);
        }


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
        /* if (id == R.id.spanish) {
            loc2 = spa;
        }
        if (id == R.id.russian) {
            loc2 = rus;
        }*/

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
            TextView textNum = (TextView) rootView.findViewById(R.id.section_number);
            Resources res = getResources();

            ImageView ivGif = (ImageView) rootView.findViewById(R.id.section_image);

           /* GIFView gifView= (GIFView)rootView.findViewById(R.id.section_gif);
            String imageFile = res.getStringArray(R.array.page_image_files)[getArguments().getInt(ARG_SECTION_NUMBER)];
            int pic = res.getIdentifier(imageFile, "raw", getContext().getPackageName());
            gifView.setGIF(pic);*/
            //imageView.setImageResource(pic);
           // GifAnimationDrawable gif;
            int pic_id = 0;
            int sound_id = 0;


            switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
                case 1:
                    pic_id = R.drawable.lion1;
                    sound_id = R.raw.lion;
                    break;
                case 2:
                    pic_id = R.drawable.cow2;
                    sound_id = R.raw.cow;
                    break;
                case 3:
                    pic_id = R.drawable.sheep3;
                    sound_id = R.raw.sheep;
                    break;
                case 4:
                    pic_id = R.drawable.duck4;
                    sound_id = R.raw.duck;
                    break;
                case 5:
                    pic_id = R.drawable.goat5;
                    sound_id = R.raw.goat;
                    break;
                case 6:
                    pic_id = R.drawable.frog6;
                    sound_id = R.raw.frog;
                    break;
                case 7:
                    pic_id = R.drawable.pig7;
                    sound_id = R.raw.pig;
                    break;
                case 8:
                    pic_id = R.drawable.dog8;
                    sound_id = R.raw.dog;
                    break;
                case 9:
                    pic_id = R.drawable.cat9;
                    sound_id = R.raw.cat;
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
            final MediaPlayer mp = MediaPlayer.create(getContext(), sound_id);

            ivGif.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mp.start();
                }
            });

            String text1 ="";
            String text2 ="";

            if (loc1.getLanguage().equals(rus.getLanguage())) {
                text1 = res.getStringArray(R.array.animals_russian)[getArguments().getInt(ARG_SECTION_NUMBER)];
            } else if (loc1.getLanguage().equals(spa.getLanguage())) {
                text1 = res.getStringArray(R.array.animals_spanish)[getArguments().getInt(ARG_SECTION_NUMBER)];
            } else {
                text1 = res.getStringArray(R.array.animals_english)[getArguments().getInt(ARG_SECTION_NUMBER)];
            }

            if (loc2.getLanguage().equals(rus.getLanguage())) {
                text2 = res.getStringArray(R.array.animals_russian)[getArguments().getInt(ARG_SECTION_NUMBER)];
            } else if (loc2.getLanguage().equals(spa.getLanguage())) {
                text2 = res.getStringArray(R.array.animals_spanish)[getArguments().getInt(ARG_SECTION_NUMBER)];
            } else {
                text2 = res.getStringArray(R.array.animals_english)[getArguments().getInt(ARG_SECTION_NUMBER)];
            }

            textView1.setText(text1);
            textView2.setText(text2);


            textNum.setText("" + getArguments().getInt(ARG_SECTION_NUMBER));


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
                return "Page " + (position + 1);
            }
        }
    }


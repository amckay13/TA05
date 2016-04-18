package com.example.user.storybookapp;

/*
http://androidosbeginning.blogspot.com/2010/09/gif-animation-in-android.html
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Movie;
import android.view.View;
import java.io.InputStream;

class GIFView extends View {

    Movie movie,movie1;
    InputStream is=null,is1=null;
    long moviestart;
    Context context;

    public GIFView(Context c) {
        super(c);
        context = c;
    }

    public void setGIF(int id){
        is=context.getResources().openRawResource(id);
        movie=Movie.decodeStream(is);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawColor(Color.WHITE);
        super.onDraw(canvas);

        if (is != null) {
            long now = android.os.SystemClock.uptimeMillis();
            System.out.println("now=" + now);
            if (moviestart == 0) { // first time
                moviestart = now;

            }
            System.out.println("\tmoviestart=" + moviestart);
            int relTime = (int) ((now - moviestart) % movie.duration());
            System.out.println("time=" + relTime + "\treltime=" + movie.duration());
            movie.setTime(relTime);
            movie.draw(canvas, this.getWidth() / 2 - 20, this.getHeight() / 2 - 40);
            this.invalidate();
        }
    }
}
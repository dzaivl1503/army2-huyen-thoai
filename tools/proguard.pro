-basedirectory ..

-injars dist/Army2D_raw.jar
-outjars dist/Army2D_obf.jar

-libraryjars lib/cldc_1.1.jar
-libraryjars lib/midp_2.1.jar
-libraryjars lib/jsr082_1.1.jar
-libraryjars lib/jsr205_2.0.jar
-libraryjars lib/jsr280_1.0.jar

-dontshrink
-dontoptimize
-dontusemixedcaseclassnames
-overloadaggressively
-repackageclasses game
-allowaccessmodification

#-classobfuscationdictionary tools/class_dict.txt
#-obfuscationdictionary tools/member_dict.txt
-printmapping dist/mapping.txt

-keep public class game.TerrainMidlet extends javax.microedition.midlet.MIDlet {
    public <init>();
    public void startApp();
    public void pauseApp();
    public void destroyApp(boolean);
}

-keepclassmembers class * extends javax.microedition.lcdui.Canvas {
    public void paint(javax.microedition.lcdui.Graphics);
    public void keyPressed(int);
    public void keyReleased(int);
    public void pointerPressed(int, int);
    public void pointerReleased(int, int);
    public void pointerDragged(int, int);
}

-keepclassmembers class * implements java.lang.Runnable {
    public void run();
}

-keepclassmembers class * implements javax.microedition.lcdui.CommandListener {
    public void commandAction(javax.microedition.lcdui.Command, javax.microedition.lcdui.Displayable);
}

-keepclassmembers class * {
    public void a_();
    public void b_();
}

-dontwarn
-ignorewarnings

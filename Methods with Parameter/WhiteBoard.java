class WhiteBoard {
    public static void write(String text) {
        System.out.println(text);
		String mark="black";
		int level=6;
		erase(mark);
		clean(level);
		draw(mark,level);
		measure(level,level);
		mark(mark,mark,level);
		display(mark,level,mark);
    }

    public static void erase(String marker) {
        System.out.println(marker);
    }

    public static void clean(int level) {
        System.out.println(level);
    }

    public static void draw(String color, int thickness) {
        System.out.println( color +  thickness);
    }

    public static void measure(int width, int height) {
        System.out.println( width + height);
    }

    public static void mark(String text, String markerType, int size) {
        System.out.println( text  + markerType +  size);
    }

    public static void display(String content, int fontSize, String fontColor) {
        System.out.println( content + fontSize + fontColor);
		String ref="pookie";
		TeddyBear.hug(ref);
    }
}

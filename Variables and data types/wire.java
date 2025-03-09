class Wire {
    public static void main(String[] values) {
        System.out.println("assignment on float and double");
        float length = 1.34f;
        float pi = 3.14f;
        float gravity = 9.18f;
        float width = 86.9f;
        float oneByTwo = 0.5f;
        double dlength = 9.929292929;
        double dpi = 3.142424555;
        double dgravity = 9.388377;
        double dwidth = 89.909877;
        System.out.println(length);
        System.out.println(gravity);
        System.out.println(width);
        System.out.println(pi);
        System.out.println(oneByTwo);
        System.out.println(dgravity);
        System.out.println(dlength);
        System.out.println(dpi);
        System.out.println(dwidth);
		System.out.println("after re-init");

       
        length = 23.33f;
        pi = 3.233f;
        gravity = 8.776f;
        width = 8.9f;
        oneByTwo = 7.78f;
        dgravity = 3.2242424;
        dlength = 3.2444;
        dpi = 8759.9033;
        dwidth = 2424.98777;

        System.out.println(length);
        System.out.println(gravity);
        System.out.println(width);
        System.out.println(pi);
        System.out.println(oneByTwo);
        System.out.println(dgravity);
        System.out.println(dlength);
        System.out.println(dpi);
        System.out.println(dwidth);
    }
}

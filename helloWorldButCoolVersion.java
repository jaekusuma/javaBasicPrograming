public class helloWorldButCoolVersion {
    public static void main(String[] args) throws InterruptedException {
        String name = "Hello World";
        char[] words = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        StringBuilder newName = new StringBuilder();
        int qwe = 0;

        while (true) {
            if (name.toLowerCase().equals(newName.toString())) {
                System.out.println(name);
                break;
            } else if (qwe >= name.length() || name.charAt(qwe) == ' ') {
                newName.append(" ");
                qwe++;
            } else {
                for (char i : words) {
                    if (name.toLowerCase().equals(newName.toString())) {
                        break;
                    } else {
                        System.out.println(newName.toString() + i);
                        Thread.sleep(200);
                    }

                    if (i == Character.toLowerCase(name.charAt(qwe))) {
                        newName.append(i);
                        qwe++;
                    }
                }
            }
        }
    }
}

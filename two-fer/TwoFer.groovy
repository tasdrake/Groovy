class TwoFer {

    static String twoFer() {
        return 'One for you, one for me.';
    }
    static String twoFer(String name) {
        if (!name.size()) {
          return 'One for you, one for me.';
        } else {
          return "One for $name, one for me.";
        }
    }
}

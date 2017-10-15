class Hamming {

    static def main(String[] args) {
      def hamming = new Hamming();
      println( new Hamming().compute('AGG','AAAACTGACCCACCCCAGG'));
    }

    def compute(strand1, strand2) {
        def count = 0;
        def length = strand1.size() > strand2.size() ? strand2.size() : strand1.size();

        def test = {s1, s2 -> s1 != s2 ? count ++ : null}

        for (def i = 0; i < length; i++) {
            test(strand1[i], strand2[i]);
        }



        return count;
    }

}

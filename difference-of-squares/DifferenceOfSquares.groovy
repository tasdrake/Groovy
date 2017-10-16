class DifferenceOfSquares {
    def num;

    def DifferenceOfSquares(num) {
        this.num = num;
    }

    def squareOfSums() {
        def res = 1;
        for (def i = 2; i <= this.num; i++) {
          res += i;
        }
        return res * res;
    }

    def sumOfSquares() {
      def res = 1;
      for (def i = 2; i <= this.num; i++) {
        res += i * i;
      }
      return res
    }

    def difference() {
        return squareOfSums() - sumOfSquares();
    }


}

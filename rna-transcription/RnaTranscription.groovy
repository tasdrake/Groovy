class RnaTranscription {

    def ofDNA(strand) {
        def complement = "";
          for (def i = 0; i < strand.size(); i++) {
              if (strand[i] == "G") {
                complement += "C";
              } else if (strand[i] == "C") {
                complement += "G";
              } else if (strand[i] == "A") {
                complement += "U";
              } else if (strand[i] == "T") {
                complement += "A";
              } else {
                throw new IllegalArgumentException("Acceptable chracters are: 'G', 'C', 'T', or 'A'")
              }
          }

          return complement;
    }

}

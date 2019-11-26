class passwordValidation {
    boolean valid1, valid2, valid3, valid4;


    void check4Length(String x) {

        int passwordLength = x.length();

        if (passwordLength < 8 || passwordLength > 10) {

            valid1 = false;
        } else {
            valid1 = true;
        }

    }

    void check4Number(String x) {
        char number;
        for (number = 48; number < 58; number++) {

            String numberString = String.valueOf(number);


            if (x.contains(numberString)) {

                valid2 = true;

            }
        }

    }

    void check4Uppercase(String x) {
        char number;

        for (number = 65; number < 91; number++) {

            String numberString = String.valueOf(number);


            if (x.contains(numberString)) {

                valid3 = true;

            }
        }


    }

    void check4Specialchar(String x) {

        char number;

        for (int s = 1; s < 3; s++) {
            switch (s) {
                case 1:
                    for (number = 33; number < 48; number++) {

                        String numberString = String.valueOf(number);


                        if (x.contains(numberString)) {

                            valid4 = true;

                        }
                    }
                    break;
                case 2:
                    for (number = 58; number < 65; number++) {

                        String numberString = String.valueOf(number);


                        if (x.contains(numberString)) {

                            valid4 = true;

                        }
                    }
                    break;
            }
        }


    }
}

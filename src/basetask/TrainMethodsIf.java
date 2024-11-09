package basetask;

public class TrainMethodsIf {
    public int returnNewInt(int number) {
        if (number < 8) {
            number = number * 7;
        } else {
            number = number / 4;
        }
        return number;
    }

    public long returnNewLong(long number) {
        if (number > 300) {
            number = number - 300;
        } else {
            number = number + 20;
        }
        return number;
    }

    public String returnNewChar(char chr) {
        String str;
        if (chr == 'g') {
            str = "go";
        } else {
            str = "o" + String.valueOf(chr);
        }
        return str;
    }

    public double returnNewDouble(double dbl) {
        if ((dbl > 30) && (dbl < 80)) {
            dbl = dbl + 87;
        } else if ((dbl > 80) && (dbl < 400)) {
            dbl = dbl - 87;
        } else if (dbl > 400) {
            dbl = dbl / 4;
        } else {
            return dbl;
        }
        return dbl;
    }

    public void returnNewBoolean(boolean bool) {
        if (bool == true) {
            System.out.println("Я получил на вход значение истины");
        } else {
            System.out.println("Я получил на вход ложь");
        }
    }
}

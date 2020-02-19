public class bonus100 {
    public static void main(String[] args) {
        int currentSum = 100;
        int addedSum = 2400;
        int totalAmount;
        int bonus;


        if (addedSum > 1000) {
            bonus = addedSum / 100;
            totalAmount = addedSum + currentSum + bonus;
            System.out.println("Благодарим Вас за пополнение счета, Вы получили " + bonus + " бонусных рублей." +
                    " На Вашем счету теперь " + totalAmount + " рублей.");
        } else if (addedSum <= 1000) {
            totalAmount = currentSum + addedSum;
            System.out.println("Благодарим Вас за пополнение счета." +
                    " На Вашем счету теперь " + totalAmount + " рублей.");


        }


    }

}


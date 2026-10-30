public class Main {
    public static void main(String[] args) {
    
        int[] results = {612, 587, 640, 598, 625, 633};

        int best = results[0]; 
        int winner = 1;        
        for (int i = 1; i < results.length; i++) {
            if (results[i] > best) {
                best = results[i];
                winner = i + 1;
            }
        }

        System.out.println("Лучший результат: " + best + " см");
        System.out.println("Поздравляем победителя - спортсмена №" + winner + "!");
        System.out.println("Модуль успешно инициализирован в Git!");
    }
}
// docs: update comments.

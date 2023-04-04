public interface Results {
    public static void main(String[] args) {
        Course course = new Course("проплыл", "пробежал", "прыгнул" ); // Создаем полосу препятствий
        Team team1 = new Team("Зайцы побегайцы");
        Team team2 = new Team("Серые волки");
        Team team3 = new Team("Хитрые лисы");// Создаем команду
        public void doIt(){
            System.out.println("Полоса претятствий, участникам нужно: проплыть - " + getSwimming +
                                       "пробежать - " + getRun + " и прыгнуть - " + getJumping);
        }
        course.doIt(team1);
        course.doIt(team2);
        course.doIt(team3);// Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}

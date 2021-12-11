package ss4_ClassAndObiectInJava.Exercise;

class StopWatch {
    private long startTime;
    private long endTime;

    void start() {
        startTime = System.currentTimeMillis();
    }
    void end() {
        endTime = System.currentTimeMillis();
    }
    long getElapsedTime() {
        return endTime - startTime;
    }
    public static void main(String[] args) {
        int[] array =new int[1000000];

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.startTime);
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random()*1000000);
        }
        stopWatch.end();
        System.out.println(stopWatch.endTime);
        System.out.println(stopWatch.getElapsedTime());
    }
}

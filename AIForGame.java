class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        int aiCoordsX = aiCoords[0];
        int aiCoordsY = aiCoords[1];
        double minLength = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < targets.length; i++) {
            int x = targets[i][0];
            int y = targets[i][1];
            double length = getLength(aiCoordsX, aiCoordsY, x, y);
            if (length < minLength) {
                minLength = length;
                index = i;
            }
        }
        return new int[]{targets[index][0],targets[index][1]};
    }
    public double getLength(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}

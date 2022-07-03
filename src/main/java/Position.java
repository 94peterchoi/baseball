public class Position implements Comparable<Position> {

    public final int position;

    public Position(int position) {
        checkValidation(position);
        this.position = position;
    }

    private void checkValidation(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("자동차의 위치는 음수일 수 없습니다.");
        }
    }

    public Position move() {
        return new Position(this.position + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;

        Position position1 = (Position) o;

        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return position;
    }

    @Override
    public int compareTo(Position p) {
        return Integer.compare(this.position, p.position);
    }
}

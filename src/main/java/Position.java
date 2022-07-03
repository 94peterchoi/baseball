import java.util.Comparator;

public class Position implements Comparable<Position> {

    private int position;

    public Position(int position) {
        checkValidation(position);
        this.position = position;
    }

    private void checkValidation(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("자동차의 위치는 음수일 수 없습니다.");
        }
    }

    public void move() {
        this.position++;
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
        if (this.position > p.position) {
            return 1;
        }
        if (this.position < p.position) {
            return -1;
        }
        return 0;
    }
}

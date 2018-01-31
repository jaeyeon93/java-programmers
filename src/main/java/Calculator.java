public interface Calculator extends MyCal {

    @Override
    default int exec(int i, int j){
        return i + j;
    }
}

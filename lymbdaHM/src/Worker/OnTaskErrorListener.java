package Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String error);
}

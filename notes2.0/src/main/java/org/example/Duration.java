package org.example;

public enum Duration {
    whole(1, 0),
    half(1, 2),
    quater(1, 4),
    eight(1, 8),
    sixteenth(1, 16);

    private int signature;
    private int count;

    Duration(int signature, int count) {
        this.signature = signature;
        this.count = count;
    }

    public int getSignature() {
        return signature;
    }

    public int getCount() {
        return count;
    }

    public void setSignature(int signature) {
        this.signature = signature;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

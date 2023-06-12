public abstract class PackegaHandler {
    protected PackegaHandler successor;

    public void setSuccessor(PackegaHandler successor) {
        this.successor = successor;
    }

    public abstract void handlePackage(Package pkg);
}


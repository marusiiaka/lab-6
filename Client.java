package company;

public class Client {
    private AbstractTechnology technology;
    private AbstractCPU cpu;

    public Client(AbstractCORP factory) {
        technology = factory.CreateTechnology();
        cpu = factory.CreateCPU();
    }

    public void Run() {
        cpu.Interact(technology);
    }
}
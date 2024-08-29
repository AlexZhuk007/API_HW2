package ru.gb.oseminar;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {
    private List<Human> queue;
    private List<Human> servedHumans;

    public Market() {
        this.queue = new ArrayList<>();
        this.servedHumans = new ArrayList<>();
    }

    @Override
    public void addHumanToQueue(Human human) {
        queue.add(human);
    }

    @Override
    public void removeHumanFromQueue(Human human) {
        queue.remove(human);
    }

    @Override
    public void enqueue(Human human) {
        addHumanToQueue(human);
    }

    @Override
    public Human dequeue() {
        if (queue.isEmpty()) {
            return null;
        }
        Human human = queue.get(0);
        removeHumanFromQueue(human);
        servedHumans.add(human);
        return human;
    }

    @Override
    public Human peek() {
        if (queue.isEmpty()) {
            return null;
        }
        return queue.get(0);
    }

    @Override
    public void acceptToMarket(Actor actor) {

    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {

    }

    public void update() {
        // обновление состояния магазина (принимать и отдавать заказы)
        if (!queue.isEmpty()) {
            Human human = dequeue();
            System.out.println("Человек " + human.getName() + " обслужен");
        }
    }

    public List<Human> getServedHumans() {
        return servedHumans;
    }

    public List<Human> getQueue() {
        return queue;
    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void giveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}
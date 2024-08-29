package ru.gb.oseminar;

import java.util.List;

public interface MarketBehaviour {
    void addHumanToQueue(Human human);

    void removeHumanFromQueue(Human human);

    void enqueue(Human human);

    Human dequeue();

    Human peek();

    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}

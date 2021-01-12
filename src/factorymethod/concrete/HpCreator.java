package factorymethod.concrete;

import factorymethod.framework.Item;
import factorymethod.framework.ItemCreator;

import java.time.LocalDate;

public class HpCreator extends ItemCreator {
    @Override
    protected void requestItemInfo() {
        System.out.println("데이터 베이스에서 체력 회복 물약의 정보를 가져옵니다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 회복 물약을 새로 생성했습니다." + LocalDate.now());
    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}

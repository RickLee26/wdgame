package org.linlinjava.litemall.gameserver.data.write;

import io.netty.buffer.ByteBuf;
import org.linlinjava.litemall.db.domain.Npc;
import org.linlinjava.litemall.gameserver.data.GameWriteTool;
import org.linlinjava.litemall.gameserver.netty.BaseWrite;
import org.springframework.stereotype.Service;

@Service
public class M45388_0 extends BaseWrite {
    @Override
    protected void writeO(ByteBuf writeBuf, Object object) {


    }

    @Override
    public int cmd() {
        return 45388;
    }
}


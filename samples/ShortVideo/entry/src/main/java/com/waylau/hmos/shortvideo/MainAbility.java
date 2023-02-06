/*
 * Copyright (c) waylau.com, 2023. All rights reserved.
 */

package com.waylau.hmos.shortvideo;

import com.waylau.hmos.shortvideo.slice.MainAbilitySlice;
import com.waylau.hmos.shortvideo.util.DatabaseUtil;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

/**
 * 首页入口
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @since 2023-01-23
 */
public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
    }

    @Override
    protected void onStop() {
        DatabaseUtil.deleteStore();
        super.onStop();
    }

}

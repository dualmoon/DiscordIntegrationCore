/*
 * Copyright (C) 2020 Ashley "luna" Davis, Airside Networks and other contributors
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses.
 */

package luna.discord.core.config;

import luna.discord.core.config.discord.DiscordConfig;
import luna.discord.core.config.imc.IMCConfig;
import luna.discord.core.config.minecraft.MinecraftConfig;
import com.google.gson.annotations.Since;

public class ConfigWrapper {
    @Since(3.0)
    public DiscordConfig discord;
    @Since(3.0)
    public MinecraftConfig minecraft;
    @Since(3.0)
    public IMCConfig imc;

    public void fillFields() {
        if (this.discord == null) {
            this.discord = new DiscordConfig();
        }
        this.discord.fillFields();

        if (this.minecraft == null) {
            this.minecraft = new MinecraftConfig();
        }
        this.minecraft.fillFields();

        if (this.imc == null) {
            this.imc = new IMCConfig();
        }
        this.imc.fillFields();
    }
}

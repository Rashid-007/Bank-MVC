/*
 * Copyright (C) 2013 Spencer Alderman
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.rogue.bank.batch;

import com.rogue.bank.control.BankController;

/**
 * Interface all commands shall implement.
 * 
 * @since 1.0.0
 * @author Robert Carmosino
 * @version 1.0.0
 */
public interface BatchCommand {

    /**
     * Executes this command with given {@link BankController} and arguments.
     * 
     * @since 1.0.0
     * @version 1.0.0
     * 
     * @param bankController The BankController used in modification.
     * @param args The command arguments.
     * @return If the command was executed without errors.
     */
    public boolean execute(BankController bankController, String[] args);

    /**
     * Returns the character used to execute this command.
     * 
     * @since 1.0.0
     * @version 1.0.0
     * 
     * @return The character used to execute this command.
     */
    public char getChar();
}

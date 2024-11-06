/*
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jmega.gameserver.data.sql;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Computador
 *
 */
public class CrownTable
{
	private static List<Integer> _crownList = new ArrayList<>();

	public static List<Integer> getCrownList()
	{
		if(_crownList.isEmpty())
		{
			_crownList.add(6841); // Crown of the lord
			_crownList.add(6834); // Innadril
			_crownList.add(6835); // Dion
			_crownList.add(6836); // Goddard
			_crownList.add(6837); // Oren
			_crownList.add(6838); // Gludio
			_crownList.add(6839); // Giran
			_crownList.add(6840); // Aden
			_crownList.add(8182); // Rune
			_crownList.add(8183); // Schuttgart
		}

		return _crownList;
	}

	public static int getCrownId(int CastleId)
	{
		int CrownId = 0;
		switch(CastleId)
		{
			// Gludio
			case 1:
				CrownId = 6838;
				break;
			// Dion
			case 2:
				CrownId = 6835;
				break;
			// Giran
			case 3:
				CrownId = 6839;
				break;
			// Oren
			case 4:
				CrownId = 6837;
				break;
			// Aden
			case 5:
				CrownId = 6840;
				break;
			// Innadril
			case 6:
				CrownId = 6834;
				break;
			// Goddard
			case 7:
				CrownId = 6836;
				break;
			// Rune
			case 8:
				CrownId = 8182;
				break;
			// Schuttgart
			case 9:
				CrownId = 8183;
				break;
			default:
				CrownId = 0;
				break;
		}
		return CrownId;
	}
}
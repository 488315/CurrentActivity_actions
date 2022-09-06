/*
 * This file is part of CurrentActivity.
 *
 * Copyright (C) 2022 Omico
 *
 * CurrentActivity is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either
 * version 3 of the License, or (at your option) any later version.
 *
 * CurrentActivity is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CurrentActivity. If not, see <https://www.gnu.org/licenses/>.
 */
package me.omico.currentactivity.ui

import androidx.compose.ui.geometry.Offset

fun Offset.coerceIn(min: Offset = Offset.Zero, max: Offset = Offset.Infinite): Offset =
    Offset(
        x = x.coerceIn(min.x, max.x),
        y = y.coerceIn(min.y, max.y),
    )

def get_input():
    m = int(input())
    grid = [] 
    for i in range(0, m): 
        grid.append(list(input().strip()))
    return grid


def find(lst, tar):
    for i in range(len(lst)):
        for j in range(len(lst[i])):
            if lst[i][j] == tar:
                return i, j


def manhattan_dist(current):
    def _dist(p1):
        # Because we have to sort the move descriptions alongside the points.
        p1 = p1[0]
        try:
            assert len(p1) == len(current)
        except AssertionError:
            raise IndexError
        else:
            return sum([abs(p1[i] - current[i]) for i in range(len(p1))])
    return _dist


def check_bounds(pos, constraint):
    return 0 <= pos[0] < constraint[0] and 0 <= pos[1] < constraint[1] 


def add(tuples):
    return tuple([sum([tuples[i][j] for i in range(len(tuples))]) for j in range(len(tuples[0]))])


def search(grid, bot, target):
    bot_pos, target_pos = find(grid, bot), find(grid, target)
    move_map = [((0, 1), "RIGHT"), ((1, 0), "DOWN"), ((0, -1), "LEFT"), ((-1, 0), "UP")]
    
    def _search(constraints, pos, targ, visited, path):
        if pos == targ:
            return path
        else:
            visited.add(pos)
            new_positions = list(map(add, [(pos, move[0]) for move in move_map]))
            move_descriptions = [move[-1] for move in move_map]
            new_positions = list(zip(new_positions, move_descriptions))
            new_positions.sort(key=manhattan_dist(targ))
            for move in new_positions:
                new_pos = move[0]
                if new_pos not in visited and check_bounds(new_pos, constraints):
                    return _search(constraints, new_pos, targ, visited, list(path + [move[1]]))

    return _search((len(grid), len(grid[0])), bot_pos, target_pos, set(), [])


_grid = get_input()

print("\n".join(search(_grid, "m", "p")))

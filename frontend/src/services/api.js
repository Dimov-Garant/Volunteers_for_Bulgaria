const API_BASE_URL = "http://localhost:8080/api";

export async function fetchReferendums() {
  const response = await fetch(`${API_BASE_URL}/referendums`);
  return response.json();
}

export async function login(username, password) {
  const response = await fetch(`${API_BASE_URL}/login`, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify({ username, password }),
  });
  return response.ok;
}
